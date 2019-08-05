using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo
    /// </summary>
    public sealed class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo:  IEquatable<ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo>
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
        public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo()
        {
        }

        private ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo(string Pid, string Title, string Description, ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder</returns>
        public static ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder Builder()
        {
            return new ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder</returns>
        public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo left, ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo left, ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties _Properties;

            internal ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoBuilder Properties(ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo</returns>
            public ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo(
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