using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo
    /// </summary>
    public sealed class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo:  IEquatable<ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo>
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
        public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo()
        {
        }

        private ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo(string Pid, string Title, string Description, ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.
        /// </summary>
        /// <returns>ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder</returns>
        public static ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder Builder()
        {
            return new ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder</returns>
        public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder With()
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

        public bool Equals(ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo left, ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo left, ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.
        /// </summary>
        public sealed class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties _Properties;

            internal ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoBuilder Properties(ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.
            /// </summary>
            /// <returns>ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo</returns>
            public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo Build()
            {
                Validate();
                return new ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo(
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