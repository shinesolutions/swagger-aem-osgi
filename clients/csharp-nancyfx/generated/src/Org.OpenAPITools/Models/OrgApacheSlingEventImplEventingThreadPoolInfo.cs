using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEventImplEventingThreadPoolInfo
    /// </summary>
    public sealed class OrgApacheSlingEventImplEventingThreadPoolInfo:  IEquatable<OrgApacheSlingEventImplEventingThreadPoolInfo>
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
        public OrgApacheSlingEventImplEventingThreadPoolProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEventImplEventingThreadPoolInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEventImplEventingThreadPoolInfo()
        {
        }

        private OrgApacheSlingEventImplEventingThreadPoolInfo(string Pid, string Title, string Description, OrgApacheSlingEventImplEventingThreadPoolProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEventImplEventingThreadPoolInfo.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplEventingThreadPoolInfoBuilder</returns>
        public static OrgApacheSlingEventImplEventingThreadPoolInfoBuilder Builder()
        {
            return new OrgApacheSlingEventImplEventingThreadPoolInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEventImplEventingThreadPoolInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplEventingThreadPoolInfoBuilder</returns>
        public OrgApacheSlingEventImplEventingThreadPoolInfoBuilder With()
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

        public bool Equals(OrgApacheSlingEventImplEventingThreadPoolInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEventImplEventingThreadPoolInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplEventingThreadPoolInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplEventingThreadPoolInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEventImplEventingThreadPoolInfo left, OrgApacheSlingEventImplEventingThreadPoolInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEventImplEventingThreadPoolInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplEventingThreadPoolInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplEventingThreadPoolInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEventImplEventingThreadPoolInfo left, OrgApacheSlingEventImplEventingThreadPoolInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEventImplEventingThreadPoolInfo.
        /// </summary>
        public sealed class OrgApacheSlingEventImplEventingThreadPoolInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingEventImplEventingThreadPoolProperties _Properties;

            internal OrgApacheSlingEventImplEventingThreadPoolInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplEventingThreadPoolInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingEventImplEventingThreadPoolInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplEventingThreadPoolInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingEventImplEventingThreadPoolInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplEventingThreadPoolInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingEventImplEventingThreadPoolInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplEventingThreadPoolInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingEventImplEventingThreadPoolInfoBuilder Properties(OrgApacheSlingEventImplEventingThreadPoolProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEventImplEventingThreadPoolInfo.
            /// </summary>
            /// <returns>OrgApacheSlingEventImplEventingThreadPoolInfo</returns>
            public OrgApacheSlingEventImplEventingThreadPoolInfo Build()
            {
                Validate();
                return new OrgApacheSlingEventImplEventingThreadPoolInfo(
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