using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo
    /// </summary>
    public sealed class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo:  IEquatable<ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo>
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
        public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo()
        {
        }

        private ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo(string Pid, string Title, string Description, ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder</returns>
        public static ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder Builder()
        {
            return new ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder</returns>
        public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo left, ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo left, ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties _Properties;

            internal ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoBuilder Properties(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo</returns>
            public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo(
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