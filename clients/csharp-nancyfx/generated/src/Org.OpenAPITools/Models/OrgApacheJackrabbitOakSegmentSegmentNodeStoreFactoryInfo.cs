using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo:  IEquatable<OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo>
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
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo()
        {
        }

        private OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder</returns>
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo left, OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo left, OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties _Properties;

            internal OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoBuilder Properties(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo</returns>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo(
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