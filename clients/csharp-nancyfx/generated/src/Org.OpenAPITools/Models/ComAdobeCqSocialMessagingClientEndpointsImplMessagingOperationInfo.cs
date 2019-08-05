using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo
    /// </summary>
    public sealed class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo:  IEquatable<ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo>
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
        public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo()
        {
        }

        private ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo(string Pid, string Title, string Description, ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder</returns>
        public static ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder Builder()
        {
            return new ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder</returns>
        public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo left, ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo left, ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties _Properties;

            internal ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoBuilder Properties(ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo</returns>
            public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo(
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