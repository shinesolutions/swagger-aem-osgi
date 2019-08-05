using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingStartupfilterImplStartupFilterImplInfo
    /// </summary>
    public sealed class OrgApacheSlingStartupfilterImplStartupFilterImplInfo:  IEquatable<OrgApacheSlingStartupfilterImplStartupFilterImplInfo>
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
        public OrgApacheSlingStartupfilterImplStartupFilterImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingStartupfilterImplStartupFilterImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingStartupfilterImplStartupFilterImplInfo()
        {
        }

        private OrgApacheSlingStartupfilterImplStartupFilterImplInfo(string Pid, string Title, string Description, OrgApacheSlingStartupfilterImplStartupFilterImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingStartupfilterImplStartupFilterImplInfo.
        /// </summary>
        /// <returns>OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder</returns>
        public static OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder Builder()
        {
            return new OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder</returns>
        public OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder With()
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

        public bool Equals(OrgApacheSlingStartupfilterImplStartupFilterImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingStartupfilterImplStartupFilterImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingStartupfilterImplStartupFilterImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingStartupfilterImplStartupFilterImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingStartupfilterImplStartupFilterImplInfo left, OrgApacheSlingStartupfilterImplStartupFilterImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingStartupfilterImplStartupFilterImplInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingStartupfilterImplStartupFilterImplInfo</param>
        /// <param name="right">Compared (OrgApacheSlingStartupfilterImplStartupFilterImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingStartupfilterImplStartupFilterImplInfo left, OrgApacheSlingStartupfilterImplStartupFilterImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingStartupfilterImplStartupFilterImplInfo.
        /// </summary>
        public sealed class OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingStartupfilterImplStartupFilterImplProperties _Properties;

            internal OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingStartupfilterImplStartupFilterImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingStartupfilterImplStartupFilterImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingStartupfilterImplStartupFilterImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingStartupfilterImplStartupFilterImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingStartupfilterImplStartupFilterImplInfoBuilder Properties(OrgApacheSlingStartupfilterImplStartupFilterImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingStartupfilterImplStartupFilterImplInfo.
            /// </summary>
            /// <returns>OrgApacheSlingStartupfilterImplStartupFilterImplInfo</returns>
            public OrgApacheSlingStartupfilterImplStartupFilterImplInfo Build()
            {
                Validate();
                return new OrgApacheSlingStartupfilterImplStartupFilterImplInfo(
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