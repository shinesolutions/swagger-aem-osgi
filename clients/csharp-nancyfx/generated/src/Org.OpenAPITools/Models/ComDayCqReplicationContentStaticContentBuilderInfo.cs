using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationContentStaticContentBuilderInfo
    /// </summary>
    public sealed class ComDayCqReplicationContentStaticContentBuilderInfo:  IEquatable<ComDayCqReplicationContentStaticContentBuilderInfo>
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
        public ComDayCqReplicationContentStaticContentBuilderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationContentStaticContentBuilderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationContentStaticContentBuilderInfo()
        {
        }

        private ComDayCqReplicationContentStaticContentBuilderInfo(string Pid, string Title, string Description, ComDayCqReplicationContentStaticContentBuilderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationContentStaticContentBuilderInfo.
        /// </summary>
        /// <returns>ComDayCqReplicationContentStaticContentBuilderInfoBuilder</returns>
        public static ComDayCqReplicationContentStaticContentBuilderInfoBuilder Builder()
        {
            return new ComDayCqReplicationContentStaticContentBuilderInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationContentStaticContentBuilderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationContentStaticContentBuilderInfoBuilder</returns>
        public ComDayCqReplicationContentStaticContentBuilderInfoBuilder With()
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

        public bool Equals(ComDayCqReplicationContentStaticContentBuilderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationContentStaticContentBuilderInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationContentStaticContentBuilderInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationContentStaticContentBuilderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationContentStaticContentBuilderInfo left, ComDayCqReplicationContentStaticContentBuilderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationContentStaticContentBuilderInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationContentStaticContentBuilderInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationContentStaticContentBuilderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationContentStaticContentBuilderInfo left, ComDayCqReplicationContentStaticContentBuilderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationContentStaticContentBuilderInfo.
        /// </summary>
        public sealed class ComDayCqReplicationContentStaticContentBuilderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReplicationContentStaticContentBuilderProperties _Properties;

            internal ComDayCqReplicationContentStaticContentBuilderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationContentStaticContentBuilderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReplicationContentStaticContentBuilderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationContentStaticContentBuilderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReplicationContentStaticContentBuilderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationContentStaticContentBuilderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReplicationContentStaticContentBuilderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationContentStaticContentBuilderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReplicationContentStaticContentBuilderInfoBuilder Properties(ComDayCqReplicationContentStaticContentBuilderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationContentStaticContentBuilderInfo.
            /// </summary>
            /// <returns>ComDayCqReplicationContentStaticContentBuilderInfo</returns>
            public ComDayCqReplicationContentStaticContentBuilderInfo Build()
            {
                Validate();
                return new ComDayCqReplicationContentStaticContentBuilderInfo(
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