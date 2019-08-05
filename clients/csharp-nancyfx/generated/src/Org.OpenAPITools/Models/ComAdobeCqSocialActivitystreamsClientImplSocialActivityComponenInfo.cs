using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo
    /// </summary>
    public sealed class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo:  IEquatable<ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo>
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
        public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo()
        {
        }

        private ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo(string Pid, string Title, string Description, ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder</returns>
        public static ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder Builder()
        {
            return new ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder</returns>
        public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo left, ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo left, ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties _Properties;

            internal ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoBuilder Properties(ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo</returns>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo(
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