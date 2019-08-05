using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo
    /// </summary>
    public sealed class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo:  IEquatable<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo>
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
        public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo()
        {
        }

        private ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo(string Pid, string Title, string Description, ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder</returns>
        public static ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder Builder()
        {
            return new ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder</returns>
        public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo left, ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo left, ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties _Properties;

            internal ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoBuilder Properties(ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo</returns>
            public ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo(
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