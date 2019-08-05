using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo
    /// </summary>
    public sealed class ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo:  IEquatable<ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo>
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
        public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo()
        {
        }

        private ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo(string Pid, string Title, string Description, ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder</returns>
        public static ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder Builder()
        {
            return new ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder</returns>
        public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo left, ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo left, ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties _Properties;

            internal ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoBuilder Properties(ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo</returns>
            public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo(
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