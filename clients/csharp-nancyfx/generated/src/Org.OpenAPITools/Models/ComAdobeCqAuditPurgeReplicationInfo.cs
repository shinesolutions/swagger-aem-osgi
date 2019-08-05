using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAuditPurgeReplicationInfo
    /// </summary>
    public sealed class ComAdobeCqAuditPurgeReplicationInfo:  IEquatable<ComAdobeCqAuditPurgeReplicationInfo>
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
        public ComAdobeCqAuditPurgeReplicationProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqAuditPurgeReplicationInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAuditPurgeReplicationInfo()
        {
        }

        private ComAdobeCqAuditPurgeReplicationInfo(string Pid, string Title, string Description, ComAdobeCqAuditPurgeReplicationProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqAuditPurgeReplicationInfo.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgeReplicationInfoBuilder</returns>
        public static ComAdobeCqAuditPurgeReplicationInfoBuilder Builder()
        {
            return new ComAdobeCqAuditPurgeReplicationInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAuditPurgeReplicationInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgeReplicationInfoBuilder</returns>
        public ComAdobeCqAuditPurgeReplicationInfoBuilder With()
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

        public bool Equals(ComAdobeCqAuditPurgeReplicationInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAuditPurgeReplicationInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgeReplicationInfo</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgeReplicationInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAuditPurgeReplicationInfo left, ComAdobeCqAuditPurgeReplicationInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAuditPurgeReplicationInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgeReplicationInfo</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgeReplicationInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAuditPurgeReplicationInfo left, ComAdobeCqAuditPurgeReplicationInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAuditPurgeReplicationInfo.
        /// </summary>
        public sealed class ComAdobeCqAuditPurgeReplicationInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqAuditPurgeReplicationProperties _Properties;

            internal ComAdobeCqAuditPurgeReplicationInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeReplicationInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqAuditPurgeReplicationInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeReplicationInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqAuditPurgeReplicationInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeReplicationInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqAuditPurgeReplicationInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeReplicationInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqAuditPurgeReplicationInfoBuilder Properties(ComAdobeCqAuditPurgeReplicationProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAuditPurgeReplicationInfo.
            /// </summary>
            /// <returns>ComAdobeCqAuditPurgeReplicationInfo</returns>
            public ComAdobeCqAuditPurgeReplicationInfo Build()
            {
                Validate();
                return new ComAdobeCqAuditPurgeReplicationInfo(
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