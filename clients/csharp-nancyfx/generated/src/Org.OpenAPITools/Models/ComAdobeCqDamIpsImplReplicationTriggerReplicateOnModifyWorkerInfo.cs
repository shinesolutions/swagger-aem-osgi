using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo
    /// </summary>
    public sealed class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo:  IEquatable<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo>
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
        public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo()
        {
        }

        private ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo(string Pid, string Title, string Description, ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder</returns>
        public static ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder Builder()
        {
            return new ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder</returns>
        public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo left, ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo left, ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo.
        /// </summary>
        public sealed class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties _Properties;

            internal ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoBuilder Properties(ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo</returns>
            public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo Build()
            {
                Validate();
                return new ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo(
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