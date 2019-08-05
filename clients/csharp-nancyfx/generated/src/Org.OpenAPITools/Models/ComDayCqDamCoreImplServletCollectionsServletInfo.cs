using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletCollectionsServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletCollectionsServletInfo:  IEquatable<ComDayCqDamCoreImplServletCollectionsServletInfo>
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
        public ComDayCqDamCoreImplServletCollectionsServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletCollectionsServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletCollectionsServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletCollectionsServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletCollectionsServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletCollectionsServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCollectionsServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletCollectionsServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletCollectionsServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletCollectionsServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletCollectionsServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletCollectionsServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletCollectionsServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletCollectionsServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCollectionsServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCollectionsServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletCollectionsServletInfo left, ComDayCqDamCoreImplServletCollectionsServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletCollectionsServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletCollectionsServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletCollectionsServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletCollectionsServletInfo left, ComDayCqDamCoreImplServletCollectionsServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletCollectionsServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletCollectionsServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletCollectionsServletProperties _Properties;

            internal ComDayCqDamCoreImplServletCollectionsServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionsServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletCollectionsServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionsServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletCollectionsServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionsServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletCollectionsServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletCollectionsServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletCollectionsServletInfoBuilder Properties(ComDayCqDamCoreImplServletCollectionsServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletCollectionsServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletCollectionsServletInfo</returns>
            public ComDayCqDamCoreImplServletCollectionsServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletCollectionsServletInfo(
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