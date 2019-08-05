using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingModelsImplModelAdapterFactoryInfo
    /// </summary>
    public sealed class OrgApacheSlingModelsImplModelAdapterFactoryInfo:  IEquatable<OrgApacheSlingModelsImplModelAdapterFactoryInfo>
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
        public OrgApacheSlingModelsImplModelAdapterFactoryProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingModelsImplModelAdapterFactoryInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingModelsImplModelAdapterFactoryInfo()
        {
        }

        private OrgApacheSlingModelsImplModelAdapterFactoryInfo(string Pid, string Title, string Description, OrgApacheSlingModelsImplModelAdapterFactoryProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingModelsImplModelAdapterFactoryInfo.
        /// </summary>
        /// <returns>OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder</returns>
        public static OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder Builder()
        {
            return new OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder</returns>
        public OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder With()
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

        public bool Equals(OrgApacheSlingModelsImplModelAdapterFactoryInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingModelsImplModelAdapterFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingModelsImplModelAdapterFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingModelsImplModelAdapterFactoryInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingModelsImplModelAdapterFactoryInfo left, OrgApacheSlingModelsImplModelAdapterFactoryInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingModelsImplModelAdapterFactoryInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingModelsImplModelAdapterFactoryInfo</param>
        /// <param name="right">Compared (OrgApacheSlingModelsImplModelAdapterFactoryInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingModelsImplModelAdapterFactoryInfo left, OrgApacheSlingModelsImplModelAdapterFactoryInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingModelsImplModelAdapterFactoryInfo.
        /// </summary>
        public sealed class OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingModelsImplModelAdapterFactoryProperties _Properties;

            internal OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsImplModelAdapterFactoryInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsImplModelAdapterFactoryInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsImplModelAdapterFactoryInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsImplModelAdapterFactoryInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingModelsImplModelAdapterFactoryInfoBuilder Properties(OrgApacheSlingModelsImplModelAdapterFactoryProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingModelsImplModelAdapterFactoryInfo.
            /// </summary>
            /// <returns>OrgApacheSlingModelsImplModelAdapterFactoryInfo</returns>
            public OrgApacheSlingModelsImplModelAdapterFactoryInfo Build()
            {
                Validate();
                return new OrgApacheSlingModelsImplModelAdapterFactoryInfo(
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