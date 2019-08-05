using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo:  IEquatable<ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo()
        {
        }

        private ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo(string Pid, string Title, string Description, ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder</returns>
        public static ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder</returns>
        public ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo left, ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo left, ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties _Properties;

            internal ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteActivitystreamsImplActivityManagerImplInfoBuilder Properties(ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo</returns>
            public ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}