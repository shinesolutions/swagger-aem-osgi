using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo
    /// </summary>
    public sealed class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo:  IEquatable<ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo>
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
        public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo()
        {
        }

        private ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo(string Pid, string Title, string Description, ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder</returns>
        public static ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder Builder()
        {
            return new ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder</returns>
        public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo left, ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo left, ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties _Properties;

            internal ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoBuilder Properties(ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo</returns>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo(
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