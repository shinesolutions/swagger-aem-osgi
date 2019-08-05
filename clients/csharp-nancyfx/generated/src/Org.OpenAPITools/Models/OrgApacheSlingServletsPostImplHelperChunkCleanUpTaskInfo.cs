using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo
    /// </summary>
    public sealed class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo:  IEquatable<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo>
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
        public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo()
        {
        }

        private OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo(string Pid, string Title, string Description, OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo.
        /// </summary>
        /// <returns>OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder</returns>
        public static OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder Builder()
        {
            return new OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder</returns>
        public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder With()
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

        public bool Equals(OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo left, OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo left, OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo.
        /// </summary>
        public sealed class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties _Properties;

            internal OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoBuilder Properties(OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo.
            /// </summary>
            /// <returns>OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo</returns>
            public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo Build()
            {
                Validate();
                return new OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo(
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