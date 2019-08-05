using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo
    /// </summary>
    public sealed class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo:  IEquatable<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo>
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
        public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo()
        {
        }

        private OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo(string Pid, string Title, string Description, OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder</returns>
        public static OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder Builder()
        {
            return new OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder</returns>
        public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder With()
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

        public bool Equals(OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo left, OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo left, OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.
        /// </summary>
        public sealed class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties _Properties;

            internal OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoBuilder Properties(OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.
            /// </summary>
            /// <returns>OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo</returns>
            public OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo Build()
            {
                Validate();
                return new OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo(
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