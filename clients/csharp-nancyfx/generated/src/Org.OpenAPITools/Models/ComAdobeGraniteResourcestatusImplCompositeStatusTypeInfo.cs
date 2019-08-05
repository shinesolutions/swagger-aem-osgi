using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo
    /// </summary>
    public sealed class ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo:  IEquatable<ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo>
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
        public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo()
        {
        }

        private ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo(string Pid, string Title, string Description, ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder</returns>
        public static ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder Builder()
        {
            return new ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder</returns>
        public ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo left, ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo left, ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo.
        /// </summary>
        public sealed class ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties _Properties;

            internal ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfoBuilder Properties(ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo</returns>
            public ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo Build()
            {
                Validate();
                return new ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo(
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