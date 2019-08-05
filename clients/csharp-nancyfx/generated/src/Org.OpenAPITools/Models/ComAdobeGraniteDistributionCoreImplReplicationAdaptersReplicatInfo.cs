using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo:  IEquatable<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo>
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
        public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo()
        {
        }

        private ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo(string Pid, string Title, string Description, ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo left, ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo left, ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties _Properties;

            internal ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoBuilder Properties(ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo</returns>
            public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo(
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