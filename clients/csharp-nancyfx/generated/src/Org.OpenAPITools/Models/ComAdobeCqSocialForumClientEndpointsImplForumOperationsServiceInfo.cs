using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo
    /// </summary>
    public sealed class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo:  IEquatable<ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo>
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
        public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo()
        {
        }

        private ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo(string Pid, string Title, string Description, ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder</returns>
        public static ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder Builder()
        {
            return new ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder</returns>
        public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo left, ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo left, ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties _Properties;

            internal ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoBuilder Properties(ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo</returns>
            public ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo(
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