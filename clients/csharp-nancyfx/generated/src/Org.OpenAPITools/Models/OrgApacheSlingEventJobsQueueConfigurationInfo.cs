using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEventJobsQueueConfigurationInfo
    /// </summary>
    public sealed class OrgApacheSlingEventJobsQueueConfigurationInfo:  IEquatable<OrgApacheSlingEventJobsQueueConfigurationInfo>
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
        public OrgApacheSlingEventJobsQueueConfigurationProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEventJobsQueueConfigurationInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEventJobsQueueConfigurationInfo()
        {
        }

        private OrgApacheSlingEventJobsQueueConfigurationInfo(string Pid, string Title, string Description, OrgApacheSlingEventJobsQueueConfigurationProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEventJobsQueueConfigurationInfo.
        /// </summary>
        /// <returns>OrgApacheSlingEventJobsQueueConfigurationInfoBuilder</returns>
        public static OrgApacheSlingEventJobsQueueConfigurationInfoBuilder Builder()
        {
            return new OrgApacheSlingEventJobsQueueConfigurationInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEventJobsQueueConfigurationInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEventJobsQueueConfigurationInfoBuilder</returns>
        public OrgApacheSlingEventJobsQueueConfigurationInfoBuilder With()
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

        public bool Equals(OrgApacheSlingEventJobsQueueConfigurationInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEventJobsQueueConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventJobsQueueConfigurationInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEventJobsQueueConfigurationInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEventJobsQueueConfigurationInfo left, OrgApacheSlingEventJobsQueueConfigurationInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEventJobsQueueConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventJobsQueueConfigurationInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEventJobsQueueConfigurationInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEventJobsQueueConfigurationInfo left, OrgApacheSlingEventJobsQueueConfigurationInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEventJobsQueueConfigurationInfo.
        /// </summary>
        public sealed class OrgApacheSlingEventJobsQueueConfigurationInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingEventJobsQueueConfigurationProperties _Properties;

            internal OrgApacheSlingEventJobsQueueConfigurationInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingEventJobsQueueConfigurationInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingEventJobsQueueConfigurationInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingEventJobsQueueConfigurationInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventJobsQueueConfigurationInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingEventJobsQueueConfigurationInfoBuilder Properties(OrgApacheSlingEventJobsQueueConfigurationProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEventJobsQueueConfigurationInfo.
            /// </summary>
            /// <returns>OrgApacheSlingEventJobsQueueConfigurationInfo</returns>
            public OrgApacheSlingEventJobsQueueConfigurationInfo Build()
            {
                Validate();
                return new OrgApacheSlingEventJobsQueueConfigurationInfo(
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