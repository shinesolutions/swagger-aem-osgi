using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo
    /// </summary>
    public sealed class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo:  IEquatable<ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo>
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
        public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo()
        {
        }

        private ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo(string Pid, string Title, string Description, ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder</returns>
        public static ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder Builder()
        {
            return new ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder</returns>
        public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo left, ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo left, ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo.
        /// </summary>
        public sealed class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties _Properties;

            internal ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoBuilder Properties(ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo</returns>
            public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo Build()
            {
                Validate();
                return new ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo(
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