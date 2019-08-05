using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo:  IEquatable<ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo>
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
        public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo()
        {
        }

        private ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder</returns>
        public static ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder</returns>
        public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo left, ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo left, ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties _Properties;

            internal ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoBuilder Properties(ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo</returns>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo(
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