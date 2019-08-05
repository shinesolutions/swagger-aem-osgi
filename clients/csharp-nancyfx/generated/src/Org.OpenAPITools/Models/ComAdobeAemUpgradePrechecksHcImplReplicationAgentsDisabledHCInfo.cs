using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo
    /// </summary>
    public sealed class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo:  IEquatable<ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo>
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
        public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo()
        {
        }

        private ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo(string Pid, string Title, string Description, ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder</returns>
        public static ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder Builder()
        {
            return new ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder</returns>
        public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder With()
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

        public bool Equals(ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo left, ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo</param>
        /// <param name="right">Compared (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo left, ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.
        /// </summary>
        public sealed class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties _Properties;

            internal ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoBuilder Properties(ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo.
            /// </summary>
            /// <returns>ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo</returns>
            public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo Build()
            {
                Validate();
                return new ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo(
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