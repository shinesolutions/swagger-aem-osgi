using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo
    /// </summary>
    public sealed class ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo:  IEquatable<ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo>
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
        public ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo()
        {
        }

        private ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo(string Pid, string Title, string Description, ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder</returns>
        public static ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder Builder()
        {
            return new ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder</returns>
        public ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo left, ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo left, ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties _Properties;

            internal ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoBuilder Properties(ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo</returns>
            public ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo(
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