using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo
    /// </summary>
    public sealed class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo:  IEquatable<ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo>
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
        public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo()
        {
        }

        private ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo(string Pid, string Title, string Description, ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder</returns>
        public static ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder Builder()
        {
            return new ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder</returns>
        public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo left, ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo left, ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties _Properties;

            internal ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoBuilder Properties(ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo</returns>
            public ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo(
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