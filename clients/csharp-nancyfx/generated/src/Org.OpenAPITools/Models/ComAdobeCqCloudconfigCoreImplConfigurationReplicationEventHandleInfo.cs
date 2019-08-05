using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo
    /// </summary>
    public sealed class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo:  IEquatable<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo>
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
        public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo()
        {
        }

        private ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo(string Pid, string Title, string Description, ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.
        /// </summary>
        /// <returns>ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder</returns>
        public static ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder Builder()
        {
            return new ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder</returns>
        public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder With()
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

        public bool Equals(ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo</param>
        /// <param name="right">Compared (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo left, ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo</param>
        /// <param name="right">Compared (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo left, ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.
        /// </summary>
        public sealed class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties _Properties;

            internal ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoBuilder Properties(ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.
            /// </summary>
            /// <returns>ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo</returns>
            public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo Build()
            {
                Validate();
                return new ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo(
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