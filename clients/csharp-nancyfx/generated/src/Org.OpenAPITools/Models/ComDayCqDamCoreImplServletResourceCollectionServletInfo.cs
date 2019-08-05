using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletResourceCollectionServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletResourceCollectionServletInfo:  IEquatable<ComDayCqDamCoreImplServletResourceCollectionServletInfo>
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
        public ComDayCqDamCoreImplServletResourceCollectionServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletResourceCollectionServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletResourceCollectionServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletResourceCollectionServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletResourceCollectionServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletResourceCollectionServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletResourceCollectionServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletResourceCollectionServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletResourceCollectionServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletResourceCollectionServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletResourceCollectionServletInfo left, ComDayCqDamCoreImplServletResourceCollectionServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletResourceCollectionServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletResourceCollectionServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletResourceCollectionServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletResourceCollectionServletInfo left, ComDayCqDamCoreImplServletResourceCollectionServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletResourceCollectionServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletResourceCollectionServletProperties _Properties;

            internal ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletResourceCollectionServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletResourceCollectionServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletResourceCollectionServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletResourceCollectionServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletResourceCollectionServletInfoBuilder Properties(ComDayCqDamCoreImplServletResourceCollectionServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletResourceCollectionServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletResourceCollectionServletInfo</returns>
            public ComDayCqDamCoreImplServletResourceCollectionServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletResourceCollectionServletInfo(
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