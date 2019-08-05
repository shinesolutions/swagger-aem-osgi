using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplAssetMoveListenerInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplAssetMoveListenerInfo:  IEquatable<ComDayCqDamCoreImplAssetMoveListenerInfo>
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
        public ComDayCqDamCoreImplAssetMoveListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplAssetMoveListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplAssetMoveListenerInfo()
        {
        }

        private ComDayCqDamCoreImplAssetMoveListenerInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplAssetMoveListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplAssetMoveListenerInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssetMoveListenerInfoBuilder</returns>
        public static ComDayCqDamCoreImplAssetMoveListenerInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplAssetMoveListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplAssetMoveListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssetMoveListenerInfoBuilder</returns>
        public ComDayCqDamCoreImplAssetMoveListenerInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplAssetMoveListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplAssetMoveListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssetMoveListenerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssetMoveListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplAssetMoveListenerInfo left, ComDayCqDamCoreImplAssetMoveListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplAssetMoveListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssetMoveListenerInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssetMoveListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplAssetMoveListenerInfo left, ComDayCqDamCoreImplAssetMoveListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplAssetMoveListenerInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplAssetMoveListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplAssetMoveListenerProperties _Properties;

            internal ComDayCqDamCoreImplAssetMoveListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssetMoveListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplAssetMoveListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssetMoveListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplAssetMoveListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssetMoveListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplAssetMoveListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssetMoveListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplAssetMoveListenerInfoBuilder Properties(ComDayCqDamCoreImplAssetMoveListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplAssetMoveListenerInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplAssetMoveListenerInfo</returns>
            public ComDayCqDamCoreImplAssetMoveListenerInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplAssetMoveListenerInfo(
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