using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplGfxCommonsGfxRendererInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplGfxCommonsGfxRendererInfo:  IEquatable<ComDayCqDamCoreImplGfxCommonsGfxRendererInfo>
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
        public ComDayCqDamCoreImplGfxCommonsGfxRendererProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplGfxCommonsGfxRendererInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplGfxCommonsGfxRendererInfo()
        {
        }

        private ComDayCqDamCoreImplGfxCommonsGfxRendererInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplGfxCommonsGfxRendererProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplGfxCommonsGfxRendererInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder</returns>
        public static ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder</returns>
        public ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplGfxCommonsGfxRendererInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplGfxCommonsGfxRendererInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplGfxCommonsGfxRendererInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplGfxCommonsGfxRendererInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplGfxCommonsGfxRendererInfo left, ComDayCqDamCoreImplGfxCommonsGfxRendererInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplGfxCommonsGfxRendererInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplGfxCommonsGfxRendererInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplGfxCommonsGfxRendererInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplGfxCommonsGfxRendererInfo left, ComDayCqDamCoreImplGfxCommonsGfxRendererInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplGfxCommonsGfxRendererInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplGfxCommonsGfxRendererProperties _Properties;

            internal ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplGfxCommonsGfxRendererInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplGfxCommonsGfxRendererInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplGfxCommonsGfxRendererInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplGfxCommonsGfxRendererInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplGfxCommonsGfxRendererInfoBuilder Properties(ComDayCqDamCoreImplGfxCommonsGfxRendererProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplGfxCommonsGfxRendererInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplGfxCommonsGfxRendererInfo</returns>
            public ComDayCqDamCoreImplGfxCommonsGfxRendererInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplGfxCommonsGfxRendererInfo(
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