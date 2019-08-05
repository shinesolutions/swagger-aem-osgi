using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo
    /// </summary>
    public sealed class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo:  IEquatable<OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo>
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
        public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo()
        {
        }

        private OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo(string Pid, string Title, string Description, OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder</returns>
        public static OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder Builder()
        {
            return new OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder</returns>
        public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder With()
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

        public bool Equals(OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo left, OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo left, OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.
        /// </summary>
        public sealed class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties _Properties;

            internal OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoBuilder Properties(OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo</returns>
            public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo Build()
            {
                Validate();
                return new OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo(
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