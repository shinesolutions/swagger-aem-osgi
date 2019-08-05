using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo:  IEquatable<ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo>
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
        public ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo()
        {
        }

        private ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder</returns>
        public static ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder</returns>
        public ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo left, ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo left, ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties _Properties;

            internal ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoBuilder Properties(ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo</returns>
            public ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo(
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