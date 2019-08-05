using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo
    /// </summary>
    public sealed class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo:  IEquatable<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo>
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
        public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo()
        {
        }

        private ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo(string Pid, string Title, string Description, ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder</returns>
        public static ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder Builder()
        {
            return new ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder</returns>
        public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo left, ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo left, ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties _Properties;

            internal ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoBuilder Properties(ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo</returns>
            public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo(
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