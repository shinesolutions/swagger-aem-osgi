using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEngineImplLogRequestLoggerServiceInfo
    /// </summary>
    public sealed class OrgApacheSlingEngineImplLogRequestLoggerServiceInfo:  IEquatable<OrgApacheSlingEngineImplLogRequestLoggerServiceInfo>
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
        public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEngineImplLogRequestLoggerServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEngineImplLogRequestLoggerServiceInfo()
        {
        }

        private OrgApacheSlingEngineImplLogRequestLoggerServiceInfo(string Pid, string Title, string Description, OrgApacheSlingEngineImplLogRequestLoggerServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEngineImplLogRequestLoggerServiceInfo.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder</returns>
        public static OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder Builder()
        {
            return new OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder</returns>
        public OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder With()
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

        public bool Equals(OrgApacheSlingEngineImplLogRequestLoggerServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEngineImplLogRequestLoggerServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplLogRequestLoggerServiceInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplLogRequestLoggerServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEngineImplLogRequestLoggerServiceInfo left, OrgApacheSlingEngineImplLogRequestLoggerServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEngineImplLogRequestLoggerServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEngineImplLogRequestLoggerServiceInfo</param>
        /// <param name="right">Compared (OrgApacheSlingEngineImplLogRequestLoggerServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEngineImplLogRequestLoggerServiceInfo left, OrgApacheSlingEngineImplLogRequestLoggerServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEngineImplLogRequestLoggerServiceInfo.
        /// </summary>
        public sealed class OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingEngineImplLogRequestLoggerServiceProperties _Properties;

            internal OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEngineImplLogRequestLoggerServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingEngineImplLogRequestLoggerServiceInfoBuilder Properties(OrgApacheSlingEngineImplLogRequestLoggerServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEngineImplLogRequestLoggerServiceInfo.
            /// </summary>
            /// <returns>OrgApacheSlingEngineImplLogRequestLoggerServiceInfo</returns>
            public OrgApacheSlingEngineImplLogRequestLoggerServiceInfo Build()
            {
                Validate();
                return new OrgApacheSlingEngineImplLogRequestLoggerServiceInfo(
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