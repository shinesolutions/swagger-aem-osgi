using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo:  IEquatable<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo>
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
        public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo()
        {
        }

        private ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder</returns>
        public static ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder</returns>
        public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo left, ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo left, ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties _Properties;

            internal ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoBuilder Properties(ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo</returns>
            public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo(
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