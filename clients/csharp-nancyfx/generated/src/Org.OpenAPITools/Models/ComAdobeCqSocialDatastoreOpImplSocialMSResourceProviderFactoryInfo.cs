using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo
    /// </summary>
    public sealed class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo:  IEquatable<ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo>
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
        public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo()
        {
        }

        private ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo(string Pid, string Title, string Description, ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder</returns>
        public static ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder Builder()
        {
            return new ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder</returns>
        public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo left, ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo left, ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties _Properties;

            internal ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoBuilder Properties(ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo</returns>
            public ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo(
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