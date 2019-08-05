using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo:  IEquatable<ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo>
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
        public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo()
        {
        }

        private ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo(string Pid, string Title, string Description, ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder</returns>
        public static ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder</returns>
        public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo left, ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo left, ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties _Properties;

            internal ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoBuilder Properties(ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo</returns>
            public ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo(
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