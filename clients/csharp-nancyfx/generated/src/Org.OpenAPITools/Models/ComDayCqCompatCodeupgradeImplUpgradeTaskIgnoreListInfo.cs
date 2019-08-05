using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo
    /// </summary>
    public sealed class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo:  IEquatable<ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo>
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
        public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo()
        {
        }

        private ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo(string Pid, string Title, string Description, ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo.
        /// </summary>
        /// <returns>ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder</returns>
        public static ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder Builder()
        {
            return new ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder</returns>
        public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder With()
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

        public bool Equals(ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo</param>
        /// <param name="right">Compared (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo left, ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo</param>
        /// <param name="right">Compared (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo left, ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo.
        /// </summary>
        public sealed class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties _Properties;

            internal ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoBuilder Properties(ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo.
            /// </summary>
            /// <returns>ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo</returns>
            public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo Build()
            {
                Validate();
                return new ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo(
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