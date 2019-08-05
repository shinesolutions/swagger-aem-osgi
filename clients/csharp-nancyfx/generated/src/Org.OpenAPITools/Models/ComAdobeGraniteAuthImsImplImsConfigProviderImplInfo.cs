using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo:  IEquatable<ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo>
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
        public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo()
        {
        }

        private ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder</returns>
        public static ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder</returns>
        public ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo left, ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo left, ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties _Properties;

            internal ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoBuilder Properties(ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo</returns>
            public ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo(
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