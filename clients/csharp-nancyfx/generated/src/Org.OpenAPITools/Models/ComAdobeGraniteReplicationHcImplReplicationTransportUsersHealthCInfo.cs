using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo
    /// </summary>
    public sealed class ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo:  IEquatable<ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo>
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
        public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo()
        {
        }

        private ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo(string Pid, string Title, string Description, ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder</returns>
        public static ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder Builder()
        {
            return new ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder</returns>
        public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo left, ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo left, ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo.
        /// </summary>
        public sealed class ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties _Properties;

            internal ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoBuilder Properties(ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo</returns>
            public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo Build()
            {
                Validate();
                return new ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo(
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