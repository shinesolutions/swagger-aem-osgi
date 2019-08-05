using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCommonsHandlerStandardImageHandlerInfo
    /// </summary>
    public sealed class ComDayCqDamCommonsHandlerStandardImageHandlerInfo:  IEquatable<ComDayCqDamCommonsHandlerStandardImageHandlerInfo>
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
        public ComDayCqDamCommonsHandlerStandardImageHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCommonsHandlerStandardImageHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCommonsHandlerStandardImageHandlerInfo()
        {
        }

        private ComDayCqDamCommonsHandlerStandardImageHandlerInfo(string Pid, string Title, string Description, ComDayCqDamCommonsHandlerStandardImageHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCommonsHandlerStandardImageHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder</returns>
        public static ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder Builder()
        {
            return new ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder</returns>
        public ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqDamCommonsHandlerStandardImageHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCommonsHandlerStandardImageHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsHandlerStandardImageHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCommonsHandlerStandardImageHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCommonsHandlerStandardImageHandlerInfo left, ComDayCqDamCommonsHandlerStandardImageHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCommonsHandlerStandardImageHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCommonsHandlerStandardImageHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCommonsHandlerStandardImageHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCommonsHandlerStandardImageHandlerInfo left, ComDayCqDamCommonsHandlerStandardImageHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCommonsHandlerStandardImageHandlerInfo.
        /// </summary>
        public sealed class ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCommonsHandlerStandardImageHandlerProperties _Properties;

            internal ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsHandlerStandardImageHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsHandlerStandardImageHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsHandlerStandardImageHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCommonsHandlerStandardImageHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCommonsHandlerStandardImageHandlerInfoBuilder Properties(ComDayCqDamCommonsHandlerStandardImageHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCommonsHandlerStandardImageHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqDamCommonsHandlerStandardImageHandlerInfo</returns>
            public ComDayCqDamCommonsHandlerStandardImageHandlerInfo Build()
            {
                Validate();
                return new ComDayCqDamCommonsHandlerStandardImageHandlerInfo(
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