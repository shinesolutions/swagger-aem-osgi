using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo
    /// </summary>
    public sealed class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo:  IEquatable<ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo>
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
        public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo()
        {
        }

        private ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo(string Pid, string Title, string Description, ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo.
        /// </summary>
        /// <returns>ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder</returns>
        public static ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder Builder()
        {
            return new ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder</returns>
        public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder With()
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

        public bool Equals(ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo</param>
        /// <param name="right">Compared (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo left, ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo</param>
        /// <param name="right">Compared (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo left, ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo.
        /// </summary>
        public sealed class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties _Properties;

            internal ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoBuilder Properties(ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo.
            /// </summary>
            /// <returns>ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo</returns>
            public ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo Build()
            {
                Validate();
                return new ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo(
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