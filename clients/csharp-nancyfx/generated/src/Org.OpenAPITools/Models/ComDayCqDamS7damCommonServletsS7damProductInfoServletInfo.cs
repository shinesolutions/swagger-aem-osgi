using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo
    /// </summary>
    public sealed class ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo:  IEquatable<ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo>
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
        public ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo()
        {
        }

        private ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo(string Pid, string Title, string Description, ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder</returns>
        public static ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder Builder()
        {
            return new ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder</returns>
        public ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo left, ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo left, ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties _Properties;

            internal ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamS7damCommonServletsS7damProductInfoServletInfoBuilder Properties(ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo</returns>
            public ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo(
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