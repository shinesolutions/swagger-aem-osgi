using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo
    /// </summary>
    public sealed class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo:  IEquatable<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo>
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
        public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo()
        {
        }

        private ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo(string Pid, string Title, string Description, ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo.
        /// </summary>
        /// <returns>ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder</returns>
        public static ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder Builder()
        {
            return new ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder</returns>
        public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder With()
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

        public bool Equals(ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo</param>
        /// <param name="right">Compared (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo left, ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo</param>
        /// <param name="right">Compared (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo left, ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo.
        /// </summary>
        public sealed class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties _Properties;

            internal ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoBuilder Properties(ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo.
            /// </summary>
            /// <returns>ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo</returns>
            public ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo Build()
            {
                Validate();
                return new ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo(
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