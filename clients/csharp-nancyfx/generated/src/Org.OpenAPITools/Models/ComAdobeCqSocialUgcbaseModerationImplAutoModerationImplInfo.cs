using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo:  IEquatable<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo>
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
        public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo()
        {
        }

        private ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder</returns>
        public static ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder</returns>
        public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo left, ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo left, ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties _Properties;

            internal ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoBuilder Properties(ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo</returns>
            public ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo(
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