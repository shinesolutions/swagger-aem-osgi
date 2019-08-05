using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo
    /// </summary>
    public sealed class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo:  IEquatable<OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo>
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
        public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo()
        {
        }

        private OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo(string Pid, string Title, string Description, OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.
        /// </summary>
        /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder</returns>
        public static OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder Builder()
        {
            return new OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder</returns>
        public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder With()
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

        public bool Equals(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo left, OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo</param>
        /// <param name="right">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo left, OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.
        /// </summary>
        public sealed class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties _Properties;

            internal OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoBuilder Properties(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.
            /// </summary>
            /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo</returns>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo Build()
            {
                Validate();
                return new OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo(
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