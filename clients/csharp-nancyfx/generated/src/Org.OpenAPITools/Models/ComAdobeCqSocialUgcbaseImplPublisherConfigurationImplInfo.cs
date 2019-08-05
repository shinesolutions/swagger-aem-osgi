using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo:  IEquatable<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo>
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
        public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo()
        {
        }

        private ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder</returns>
        public static ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder</returns>
        public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo left, ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo left, ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties _Properties;

            internal ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoBuilder Properties(ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo</returns>
            public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo(
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