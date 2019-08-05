using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo
    /// </summary>
    public sealed class ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo:  IEquatable<ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo>
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
        public ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo()
        {
        }

        private ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo(string Pid, string Title, string Description, ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder</returns>
        public static ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder Builder()
        {
            return new ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder</returns>
        public ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo left, ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo left, ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties _Properties;

            internal ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfoBuilder Properties(ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo</returns>
            public ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo(
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