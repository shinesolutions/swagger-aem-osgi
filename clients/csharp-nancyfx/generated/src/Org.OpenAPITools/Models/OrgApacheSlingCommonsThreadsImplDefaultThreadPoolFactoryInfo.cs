using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo
    /// </summary>
    public sealed class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo:  IEquatable<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo>
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
        public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo()
        {
        }

        private OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo(string Pid, string Title, string Description, OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder</returns>
        public static OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder Builder()
        {
            return new OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder</returns>
        public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo left, OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo left, OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.
        /// </summary>
        public sealed class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties _Properties;

            internal OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoBuilder Properties(OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo</returns>
            public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo Build()
            {
                Validate();
                return new OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo(
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