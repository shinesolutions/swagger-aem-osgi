using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo:  IEquatable<ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo>
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
        public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo()
        {
        }

        private ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo(string Pid, string Title, string Description, ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo left, ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo left, ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties _Properties;

            internal ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoBuilder Properties(ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo</returns>
            public ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo(
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