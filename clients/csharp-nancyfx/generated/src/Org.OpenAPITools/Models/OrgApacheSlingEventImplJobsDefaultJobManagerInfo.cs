using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEventImplJobsDefaultJobManagerInfo
    /// </summary>
    public sealed class OrgApacheSlingEventImplJobsDefaultJobManagerInfo:  IEquatable<OrgApacheSlingEventImplJobsDefaultJobManagerInfo>
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
        public OrgApacheSlingEventImplJobsDefaultJobManagerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEventImplJobsDefaultJobManagerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEventImplJobsDefaultJobManagerInfo()
        {
        }

        private OrgApacheSlingEventImplJobsDefaultJobManagerInfo(string Pid, string Title, string Description, OrgApacheSlingEventImplJobsDefaultJobManagerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEventImplJobsDefaultJobManagerInfo.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder</returns>
        public static OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder Builder()
        {
            return new OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder</returns>
        public OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder With()
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

        public bool Equals(OrgApacheSlingEventImplJobsDefaultJobManagerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEventImplJobsDefaultJobManagerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplJobsDefaultJobManagerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplJobsDefaultJobManagerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEventImplJobsDefaultJobManagerInfo left, OrgApacheSlingEventImplJobsDefaultJobManagerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEventImplJobsDefaultJobManagerInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplJobsDefaultJobManagerInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplJobsDefaultJobManagerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEventImplJobsDefaultJobManagerInfo left, OrgApacheSlingEventImplJobsDefaultJobManagerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEventImplJobsDefaultJobManagerInfo.
        /// </summary>
        public sealed class OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingEventImplJobsDefaultJobManagerProperties _Properties;

            internal OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsDefaultJobManagerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsDefaultJobManagerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsDefaultJobManagerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplJobsDefaultJobManagerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingEventImplJobsDefaultJobManagerInfoBuilder Properties(OrgApacheSlingEventImplJobsDefaultJobManagerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEventImplJobsDefaultJobManagerInfo.
            /// </summary>
            /// <returns>OrgApacheSlingEventImplJobsDefaultJobManagerInfo</returns>
            public OrgApacheSlingEventImplJobsDefaultJobManagerInfo Build()
            {
                Validate();
                return new OrgApacheSlingEventImplJobsDefaultJobManagerInfo(
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