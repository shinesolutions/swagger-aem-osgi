using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo
    /// </summary>
    public sealed class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo:  IEquatable<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo>
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
        public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo()
        {
        }

        private ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo(string Pid, string Title, string Description, ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder</returns>
        public static ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder Builder()
        {
            return new ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder</returns>
        public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo left, ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo left, ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.
        /// </summary>
        public sealed class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties _Properties;

            internal ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoBuilder Properties(ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo</returns>
            public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo Build()
            {
                Validate();
                return new ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo(
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