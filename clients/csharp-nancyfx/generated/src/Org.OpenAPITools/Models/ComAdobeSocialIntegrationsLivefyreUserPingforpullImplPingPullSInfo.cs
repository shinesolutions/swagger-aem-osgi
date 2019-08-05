using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo
    /// </summary>
    public sealed class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo:  IEquatable<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo>
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
        public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo()
        {
        }

        private ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo(string Pid, string Title, string Description, ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo.
        /// </summary>
        /// <returns>ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder</returns>
        public static ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder Builder()
        {
            return new ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder</returns>
        public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder With()
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

        public bool Equals(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo</param>
        /// <param name="right">Compared (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo left, ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo</param>
        /// <param name="right">Compared (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo left, ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo.
        /// </summary>
        public sealed class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties _Properties;

            internal ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoBuilder Properties(ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo.
            /// </summary>
            /// <returns>ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo</returns>
            public ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo Build()
            {
                Validate();
                return new ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo(
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