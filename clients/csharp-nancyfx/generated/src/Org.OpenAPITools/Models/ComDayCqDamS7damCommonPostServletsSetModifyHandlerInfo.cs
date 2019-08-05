using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo
    /// </summary>
    public sealed class ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo:  IEquatable<ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo>
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
        public ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo()
        {
        }

        private ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo(string Pid, string Title, string Description, ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder</returns>
        public static ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder Builder()
        {
            return new ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder</returns>
        public ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo left, ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo left, ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties _Properties;

            internal ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfoBuilder Properties(ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo</returns>
            public ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo(
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