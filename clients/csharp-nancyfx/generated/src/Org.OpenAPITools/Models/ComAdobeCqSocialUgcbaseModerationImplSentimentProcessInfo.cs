using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo:  IEquatable<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo>
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
        public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo()
        {
        }

        private ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo(string Pid, string Title, string Description, ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder</returns>
        public static ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder</returns>
        public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo left, ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo left, ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties _Properties;

            internal ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoBuilder Properties(ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo</returns>
            public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo(
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